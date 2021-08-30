/*Copyright 2020 ZooMMaX
Licensed under the Apache License, Version 2.0*/


package com.gitlab.ZooMMaX;

public class LDTparser {
    /*str - входная строка с данными, которую надо распарсить
      razd - разделитель между данными, используемый во входной строке*/
    public String[] returnArray(String str, String razd) {
        String mass[]=mkArr(count(str,razd), str, razd);
        return mass;
    }

    /*поиск разделителя и счетчик, возвращающий количество разделителей*/
    private int count(String str, String razd){
        int index = str.indexOf(razd);
        int count = 0;
        while (index >= 0) {
            count++;
            index = str.indexOf(razd, index + 1);
        }
        return count;
    }

    /*парсер данных, сборка массива*/
    private String[] mkArr(int keyc, String str, String razd){
        String mass[] = new String[keyc];
        int index=0;
        for (int x=0; x<mass.length; x++){
            index=str.indexOf(razd);
            mass[x]=str.substring(0,index);
            if (x<mass.length){
                str=str.substring(index+1);
            }
        }
        return mass;
    }
}
