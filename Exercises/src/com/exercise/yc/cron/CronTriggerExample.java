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

	System.out.println("------- 初始化 -------------------");

    SchedulerFactory sf = new StdSchedulerFactory();
    Scheduler sched = sf.getScheduler();

    System.out.println("------- 初始化完成 --------");

    System.out.println("------- 向Scheduler加入Job ----------------");
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");  
    JobDetail job = JobBuilder.newJob(SimpleJob.class).withIdentity("job1", "group1").build();

    CronTrigger trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger1", "group1")
    		//设置Cron表达式
    		//从0秒开始 每隔20秒执行一次
    		.withSchedule(CronScheduleBuilder.cronSchedule("0/20 * * * * ?"))
    		.build();

    Date ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " 已经在 : " + dateFormat.format(ft) + " 时运行，Cron表达式：" + trigger.getCronExpression());

    job = JobBuilder.newJob(SimpleJob.class).withIdentity("job2", "group1").build();

    trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger2", "group1")
    		//从0分开始 每隔2分15秒执行一次
    		.withSchedule(CronScheduleBuilder.cronSchedule("15 0/2 * * * ?"))
    		.build();

    ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " 已经在 : " + dateFormat.format(ft) + " 时运行，Cron表达式：" + trigger.getCronExpression());

    job = JobBuilder.newJob(SimpleJob.class).withIdentity("job3", "group1").build();

    trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger3", "group1")
    		//每天的8点到17点 从0分开始 每隔2分钟执行一次
    		.withSchedule(CronScheduleBuilder.cronSchedule("0 0/2 8-17 * * ?"))
    		.build();

    ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " 已经在 : " + dateFormat.format(ft) + " 时运行，Cron表达式：" + trigger.getCronExpression());

    job = JobBuilder.newJob(SimpleJob.class).withIdentity("job4", "group1").build();

    trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger4", "group1")
    		//每天的17点到23点 从0分开始 每隔3分钟执行一次
    		.withSchedule(CronScheduleBuilder.cronSchedule("0 0/3 17-23 * * ?"))
    		.build();

    ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " 已经在 : " + dateFormat.format(ft) + " 时运行，Cron表达式：" + trigger.getCronExpression());

    job = JobBuilder.newJob(SimpleJob.class).withIdentity("job5", "group1").build();

    trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger5", "group1")
    		//在每个月的第1天和第15天那天的10点钟执行
    		.withSchedule(CronScheduleBuilder.cronSchedule("0 0 10am 1,15 * ?"))
    		.build();

    ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " 已经在 : " + dateFormat.format(ft) + " 时运行，Cron表达式：" + trigger.getCronExpression());

    job = JobBuilder.newJob(SimpleJob.class).withIdentity("job6", "group1").build();

    trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger6", "group1")
    		//周一到周五  每0秒和30秒 执行一次
    		.withSchedule(CronScheduleBuilder.cronSchedule("0,30 * * ? * MON-FRI"))
    		.build();

    ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " 已经在 : " + dateFormat.format(ft) + " 时运行，Cron表达式：" + trigger.getCronExpression());

    job = JobBuilder.newJob(SimpleJob.class).withIdentity("job7", "group1").build();

    trigger = (CronTrigger)TriggerBuilder.newTrigger()
    		.withIdentity("trigger7", "group1")
    		//周六周日  每0秒和30秒 执行一次
    		.withSchedule(CronScheduleBuilder.cronSchedule("0,30 * * ? * SAT,SUN"))
    		.build();

    ft = sched.scheduleJob(job, trigger);
    System.out.println(job.getKey() + " 已经在 : " + dateFormat.format(ft) + " 时运行，Cron表达式：" + trigger.getCronExpression());

    System.out.println("------- 开始Scheduler ----------------");

    sched.start();

    System.out.println("------- Scheduler调用job结束 -----------------");

    System.out.println("------- 等待5分钟... ------------");
    try
    {
      Thread.sleep(300000L);
    }
    catch (Exception e)
    {
    }

    System.out.println("------- 关闭Scheduler ---------------------");

    sched.shutdown(true);

    System.out.println("------- 关闭完成 -----------------");

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