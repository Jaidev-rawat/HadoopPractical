
import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper extends Mapper<LongWritable,  Text, Text, IntWritable>

{

	
	protected void map(LongWritable key, Text value,
			org.apache.hadoop.mapreduce.Mapper.Context context)
			throws IOException, InterruptedException {
	String data[]=value.toString().split(" ");
	for(String word:data)
		{
			
			if(word.equalsIgnoreCase("Apple"))
			{
				context.write(new Text("Apple"), new IntWritable(1));    
			}
			if(word.equalsIgnoreCase("Banana"))
			{
				context.write(new Text("Banana"), new IntWritable(1));    
			} 
			if(word.equalsIgnoreCase("Grapes"))
			{
				context.write(new Text("Grapes"), new IntWritable(1));    
			} 
			

		}




}
}