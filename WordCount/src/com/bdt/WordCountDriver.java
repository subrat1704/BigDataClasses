package com.bdt;

public class WordCountDriver {
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		//hoods all defaulta nd site xml properties
		Job job=Job.getInstance(conf,"Word Count");
		
		job.setMapper(WordCountMapper.class);
		job.setReducerClassWordCountReducer.claass)

		job.setJarByClass(WordCuntDriver.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		FileInputFormat.addInputPath(job,new Path(args[0]));
		FileInputFormat.setOutputPath(job,new Path(args[1]));
		
		boolean result=job.waitForCompletion(true);
		
		System.exit(result?0:1 );
				
				}
}
