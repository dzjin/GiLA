/*******************************************************************************
 * Copyright 2016 Alessio Arleo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
/**
 * 
 */
package unipg.gila.common.datastructures;

import java.io.DataInput;
import java.io.IOException;
import java.util.HashSet;

import org.apache.hadoop.io.LongWritable;

/**
 * A set of LongWritable(s). It extends the abstract class SetWritable<P extends Writable>.
 * 
 * @author Alessio Arleo
 *
 */
public class LongWritableSet extends SetWritable<LongWritable> {
	
	/**
	 * Parameter-less constructor.
	 * 
	 */
	public LongWritableSet() {
		internalState = new HashSet<LongWritable>();
	}
	
	/**
	 * This constructor will return a new LongWritableSet which is an exact copy of the given set.
	 * 
	 * @param toCopy the set to copy.
	 */
	public LongWritableSet(LongWritableSet toCopy){
		internalState = new HashSet<LongWritable>(toCopy.get());
	}

	/* (non-Javadoc)
	 * @see unipg.gila.common.datastructures.SetWritable#specificRead(java.io.DataInput)
	 */
	@Override
	protected LongWritable specificRead(DataInput in) throws IOException{
		LongWritable l = new LongWritable();
		l.readFields(in);
		return l;
	}
	
}
