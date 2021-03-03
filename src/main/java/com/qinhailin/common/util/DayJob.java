package com.qinhailin.common.util;

import java.util.Date;

/**
 * 每天8:30执行一次
 * @author yangzhiyu
 *
 */
public class DayJob implements Runnable {

	public void run() {	    
	    System.out.println("每天8:30执行一次 "+StrUtils.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss"));
	}
}