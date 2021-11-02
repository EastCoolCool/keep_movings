package com.lds.demo.Test;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/2/28 下午3:06
 */
public class SortDemo {

    public static void main(String[] args) {
        //假如map1是100条共享uid数据
        HashMap<Long, Obj> map1 = Maps.newHashMap();
        //假如map1是100条盒子uid数据
        HashMap<Long, Obj> map2 = Maps.newHashMap();
        //各增加100条数据
        for (Long i = 0L; i < 100; i++) {
            map1.put(i, new Obj(i, new Date().getTime() + new Random().nextInt(100)));
            map2.put(i + 50, new Obj(i + 50, new Date().getTime() + new Random().nextInt(100)));
        }

        long beginSortTime = System.currentTimeMillis();
        List<Obj> objs = targetList(map1, map2);
        System.out.println("#######排序去重所需的时间#####");
        System.out.println(System.currentTimeMillis() - beginSortTime);
        System.out.println(objs);

    }

    public static List<Obj> targetList(HashMap<Long, Obj> map1, HashMap<Long, Obj> map2) {
        /**
         * 遍历map2,
         * 如果map1中不存在,则直接添加
         * 如果map1中存在,比较更新时间,如果map2中时间更大,则覆盖
         */
        for (Long id : map2.keySet()) {
            if (!map1.containsKey(id)) {
                map1.put(id, map2.get(id));
                continue;
            }
            //Date数据类型可根据after,before方法比较
            if (map2.get(id).getUpdateTime() > map1.get(id).getUpdateTime()) {
                map1.put(id, map2.get(id));
            }

        }

        /**
         * map数据存储list中,方便排序
         */
        List<Obj> list = Lists.newArrayList();
        for (Map.Entry<Long, Obj> entry : map2.entrySet()) {
            list.add(entry.getValue());
        }

        /**
         * list排序
         */
        Collections.sort(list, new Comparator<Obj>() {
            @Override
            public int compare(Obj o1, Obj o2) {
                return (int) (o2.getUpdateTime() - o1.getUpdateTime());
            }
        });

        /**
         * 超过100条,则取100条
         */
        if (!CollectionUtils.isEmpty(list) && list.size() > 100) {
            list = list.subList(0, 100);
        }
        return list;
    }

    @Data
    @AllArgsConstructor
    static class Obj {
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
