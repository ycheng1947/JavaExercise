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
	//ͨ�������Ļ�ȡ
    JobKey jobKey = context.getJobDetail().getKey();

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");  
    System.out.println("SimpleJob�� ��"+ jobKey + " �� " + dateFormat.format(new Date())+" ʱ����");
  }
}