package com.lds.demo.Test;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.util.CollectionUtils;


import java.util.*;

/**
 * @description: ${description}
 * @author: JiJi.Wei
 * @create: 2019-02-28 18:55
 **/
public class SortDemo2 {
    public static void main(String[] args) {

        List<History> userHistorys = new ArrayList<History>();
        List<History> shareUserHistorys = new ArrayList<History>();
        for (Long i = 0L; i < 100; i++) {
            userHistorys.add(new History(i, new Date().getTime() + new Random().nextInt(100)));
            shareUserHistorys.add(new History(i + 50, new Date().getTime() + new Random().nextInt(100)));
        }

        long beginSortTime = System.currentTimeMillis();
        //4.将查找的结果放到同一个集合中
        userHistorys.addAll(shareUserHistorys);
        //5.在集合内部将集合按照updateTime的降序排序
        Collections.sort(userHistorys, new Comparator<History>() {
            @Override
            public int compare(History o1, History o2) {
                return (int) (o2.getUpdateTime() - o1.getUpdateTime());
            }
        });
        List<Long> ids = new ArrayList<Long>();
        //6遍历去重，将第一次出现的节目id放到结果集合中
        for (int i = 0; i < userHistorys.size(); i++) {
            //只保存第一次出现地足迹
            if (ids.contains(userHistorys.get(i).getId())) {
                //将再次出的节目足迹去除掉
                userHistorys.remove(i);
            } else {
                //将第一次出现地节目id记录下来
                ids.add(userHistorys.get(i).getId());
            }
        }

        /**
         * 超过100条,则取100条
         */
        if (!CollectionUtils.isEmpty(ids) && ids.size() > 100) {
            ids = ids.subList(0, 100);
        }

        System.out.println(ids);
        System.out.println("#######排序去重所需的时间#####");
        System.out.println(System.currentTimeMillis() - beginSortTime);
    }


    @Data
    @AllArgsConstructor
    static class History {
        /**
         * 节目id
         */
        private Long id;
        /**
         * 节目最后一次播放时间
         * new Date().getTime();
         */
        private Long updateTime;
    }
}

