package com.exercise.yc.cron;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleJob
  implements Job
{
  public void execute(JobExecutionContext context)
    throws JobExecutionException
  {
	//通过上下文获取
    JobKey jobKey = context.getJobDetail().getKey();

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");  
    System.out.println("SimpleJob类 ："+ jobKey + " 在 " + dateFormat.format(new Date())+" 时运行");
  }
}