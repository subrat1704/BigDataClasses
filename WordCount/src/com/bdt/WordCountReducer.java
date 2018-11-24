package com.bdt;

public class WordCountReducer extends Reducer<Text,IntWritable,Text,IntWritable>{
	
	@Override
	protected void reduce(Text key,Iterable<IntWritable> values,Context context) throws IOException, InterruptedException{
		int sum=0
		for(IntWritable val:values) {
			sum=sum+val.get();			
		}
		context.write(key,new IntWritable(sum));
	}

}
