package com.bdt;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper extends Mapper<LongWritable,Text,Text,IntWritable>{
	
	@Override
	protected void map(LongWritable key,Text value,Context context)throws IOException,InterruptedException {
	    StringTokenizer words= new StringTokenizer(value.toString()," ");
	    
	    while(words.hasMoreTokens()) {
	    	String word=words.nextToken();
	    	context.write(new Text(word),new IntWritable(1));
	    }
	}

}
