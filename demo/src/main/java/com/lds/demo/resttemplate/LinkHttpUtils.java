/*
package com.lds.demo.resttemplate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

*/
/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/1/22 下午4:29
 *//*

@Slf4j
@Component
public class LinkHttpUtils {

    @Autowired
    private RestTemplate restTemplate;

    */
/**
     * 发送get请求
     *
     * @param url
     * @param params
     * @return
     *//*

    public String get(String url, Map<String, Object> params) {
        url = buildGetParams(url, params);
        return restTemplate.getForObject(url, String.class);
    }

    */
/**
     * 发送post请求
     *
     * @param url
     * @param params
     * @return
     *//*

    public String post(String url, Map<String, Object> params) {
        MultiValueMap<String, Object> requestEntity = buildPostParams(params);
        return restTemplate.postForObject(url, requestEntity, String.class);
    }


    */
/**
     * 发送post请求,请求方式为:application/json
     *
     * @param url
     * @param obj
     * @return
     *//*

    public String post(String url,Object obj) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
        HttpEntity httpEntity = new HttpEntity(obj,httpHeaders);
        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity(url, httpEntity, String.class);
        return stringResponseEntity.getBody();
    }

    */
/**
     * 发送delete请求
     * @param url
     * @param params
     * @return
     *//*

    public String delete(String url, Map<String, Object> params) {
        url = buildGetParams(url, params);
        return restTemplate.execute(url, HttpMethod.DELETE,null,null,params);
    }


    */
/**
     * 构造get请求参数
     *
     * @param params
     * @return
     *//*

    private String buildGetParams(String url, Map<String, Object> params) {
        if (StringUtils.isEmpty(url) || CollectionUtils.isEmpty(params)) {
            return url;
        }
        if (url.indexOf("?") == -1) {
            url = url + "?";
        }
        StringBuffer buffer = new StringBuffer(url);
        Set<Map.Entry<String, Object>> set = params.entrySet();
        for (Iterator<Map.Entry<String, Object>> iter = set.iterator(); iter.hasNext(); ) {
            Map.Entry<String, Object> entry = iter.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            buffer.append(key).append("=").append(value).append("&");
        }
        String paramStr = buffer.toString();
        return paramStr.substring(0, paramStr.length() - 1);
    }

    */
/**
     * 构造post参数
     *
     * @param params
     * @return
     *//*

    private MultiValueMap<String, Object> buildPostParams(Map<String, Object> params) {
        MultiValueMap<String, Object> requestEntity = new LinkedMultiValueMap<String, Object>();
        if (CollectionUtils.isEmpty(params)) {
            return requestEntity;
        }
        Set<Map.Entry<String, Object>> set = params.entrySet();
        for (Iterator<Map.Entry<String, Object>> iter = set.iterator(); iter.hasNext(); ) {
            Map.Entry<String, Object> entry = iter.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            requestEntity.add(key, value);
        }
        return requestEntity;
    }

}
*/
