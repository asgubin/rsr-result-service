package ru.asgubin.rsr;

import ru.asgubin.rsr.DAO.DaoEventResult;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Long> eventNum = DaoEventResult.getInstance().getAll("00000001.RSR");

        System.out.println("Size: " + eventNum.size());
        for (Long num : eventNum) {
//            if (num == 350 || num == 349) {
//                System.out.println(num);
//            }


            System.out.println(num);
        }
    }
}
