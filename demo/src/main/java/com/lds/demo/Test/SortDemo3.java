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
public class SortDemo3 {
    public static void main(String[] args) {

        List<History> userHistorys = new ArrayList<History>();
        List<History> shareUserHistorys = new ArrayList<History>();
        for (Long i = 0L; i < 100; i++) {
            userHistorys.add(new SortDemo3.History(i, new Date().getTime() + new Random().nextInt(100)));
            shareUserHistorys.add(new SortDemo3.History(i + 50, new Date().getTime() + new Random().nextInt(100)));
        }
        long beginSortTime = System.currentTimeMillis();
        //4.将查找的结果放到同一个集合中
        userHistorys.addAll(shareUserHistorys);
        //5.在集合内部将集合按照updateTime的降序排序
        Collections.sort(userHistorys, (o1, o2) -> (int) (o2.getUpdateTime() - o1.getUpdateTime()));
        List<Long> ids = new ArrayList<Long>();
        List<History> newData = new ArrayList<History>();
        //6遍历去重，将第一次出现的节目id放到结果集合中
        for (int i = 0; i < userHistorys.size(); i++) {

            if (!ids.contains(userHistorys.get(i).getId())) {
                //将第一次出现地节目id记录下来
                ids.add(userHistorys.get(i).getId());
                //将数据放进新的集合中
                newData.add(userHistorys.get(i));
            }
        }

        if (!CollectionUtils.isEmpty(userHistorys) && userHistorys.size() > 100) {
            userHistorys = userHistorys.subList(0, 100);
        }
        System.out.println("#######排序去重所需的时间#####");
        System.out.println(System.currentTimeMillis() - beginSortTime);
        System.out.println(userHistorys);



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





