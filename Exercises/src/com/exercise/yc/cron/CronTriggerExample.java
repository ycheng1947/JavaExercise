package com.exercise.yc.cron;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SchedulerMetaData;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CronTriggerExample
{
  public void run()
    throws Exception
  {

	System.out.println("------- ��ʼ�� -------------------");

    SchedulerFactory sf = new StdSchedulerFactory();
    Scheduler sched = sf.getScheduler();

    System.out.println("------- ��ʼ����� --------");

    System.out.println("------- ��Scheduler����Job ----------------");
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");  
    JobDetail job = JobBuilder.newJob(SimpleJob.class).withIdentity("job1", "group1").build();

    CronTrigger trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger1", "group1")
    		//����Cron���ʽ
    		//��0�뿪ʼ ÿ��20��ִ��һ��
    		.withSchedule(CronScheduleBuilder.cronSchedule("0/20 * * * * ?"))
    		.build();

    Date ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " �Ѿ��� : " + dateFormat.format(ft) + " ʱ���У�Cron���ʽ��" + trigger.getCronExpression());

    job = JobBuilder.newJob(SimpleJob.class).withIdentity("job2", "group1").build();

    trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger2", "group1")
    		//��0�ֿ�ʼ ÿ��2��15��ִ��һ��
    		.withSchedule(CronScheduleBuilder.cronSchedule("15 0/2 * * * ?"))
    		.build();

    ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " �Ѿ��� : " + dateFormat.format(ft) + " ʱ���У�Cron���ʽ��" + trigger.getCronExpression());

    job = JobBuilder.newJob(SimpleJob.class).withIdentity("job3", "group1").build();

    trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger3", "group1")
    		//ÿ���8�㵽17�� ��0�ֿ�ʼ ÿ��2����ִ��һ��
    		.withSchedule(CronScheduleBuilder.cronSchedule("0 0/2 8-17 * * ?"))
    		.build();

    ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " �Ѿ��� : " + dateFormat.format(ft) + " ʱ���У�Cron���ʽ��" + trigger.getCronExpression());

    job = JobBuilder.newJob(SimpleJob.class).withIdentity("job4", "group1").build();

    trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger4", "group1")
    		//ÿ���17�㵽23�� ��0�ֿ�ʼ ÿ��3����ִ��һ��
    		.withSchedule(CronScheduleBuilder.cronSchedule("0 0/3 17-23 * * ?"))
    		.build();

    ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " �Ѿ��� : " + dateFormat.format(ft) + " ʱ���У�Cron���ʽ��" + trigger.getCronExpression());

    job = JobBuilder.newJob(SimpleJob.class).withIdentity("job5", "group1").build();

    trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger5", "group1")
    		//��ÿ���µĵ�1��͵�15�������10����ִ��
    		.withSchedule(CronScheduleBuilder.cronSchedule("0 0 10am 1,15 * ?"))
    		.build();

    ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " �Ѿ��� : " + dateFormat.format(ft) + " ʱ���У�Cron���ʽ��" + trigger.getCronExpression());

    job = JobBuilder.newJob(SimpleJob.class).withIdentity("job6", "group1").build();

    trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger6", "group1")
    		//��һ������  ÿ0���30�� ִ��һ��
    		.withSchedule(CronScheduleBuilder.cronSchedule("0,30 * * ? * MON-FRI"))
    		.build();

    ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " �Ѿ��� : " + dateFormat.format(ft) + " ʱ���У�Cron���ʽ��" + trigger.getCronExpression());

    job = JobBuilder.newJob(SimpleJob.class).withIdentity("job7", "group1").build();

    trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger7", "group1")
    		//��������  ÿ0���30�� ִ��һ��
    		.withSchedule(CronScheduleBuilder.cronSchedule("0,30 * * ? * SAT,SUN"))
    		.build();

    ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " �Ѿ��� : " + dateFormat.format(ft) + " ʱ���У�Cron���ʽ��" + trigger.getCronExpression());

    System.out.println("------- ��ʼScheduler ----------------");

    sched.start();

    System.out.println("------- Scheduler����job���� -----------------");

    System.out.println("------- �ȴ�5����... ------------");
    try
    {
      Thread.sleep(300000L);
    }
    catch (Exception e)
    {
    }

    System.out.println("------- �ر�Scheduler ---------------------");

    sched.shutdown(true);

    System.out.println("------- �ر���� -----------------");

    SchedulerMetaData metaData = sched.getMetaData();
    System.out.println("Executed " + metaData.getNumberOfJobsExecuted() + " jobs.");
  }

  public static void main(String[] args)
    throws Exception
  {
    CronTriggerExample example = new CronTriggerExample();
    example.run();
  }
}