package com.qinhailin.common.util;

import java.util.Date;

/**
 * 每4小时执行一次
 * @author yangzhiyu
 *
 */
public class FourHourJob implements Runnable {

	public void run() {	    
	    System.out.println("测试每4小时执行一次 "+StrUtils.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss"));
	}
}
