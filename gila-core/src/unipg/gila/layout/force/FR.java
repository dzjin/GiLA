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
package unipg.gila.layout.force;

/**
 * @author Alessio Arleo
 *
 */
public class FR extends Force {
	
	private float k;
	
	/**
	 * Parameter-less constructor.
	 */
	public FR() {

	}

	/* (non-Javadoc)
	 * @see unipg.dafne.layout.force.Force#generateForce(java.lang.String[])
	 */
	@Override
	public void generateForce(String[] args, float k) {
		this.k = k;
	}

	/* (non-Javadoc)
	 * @see unipg.dafne.layout.force.Force#computeAttractiveForce(float[], float)
	 */
	@Override
	public float[] computeAttractiveForce(float deltaX, float deltaY, float distance, float squareDistance, int v1Deg, int v2Deg) {
		return new float[]{
				deltaX*distance/k,
				deltaY*distance/k};
	}

	/* (non-Javadoc)
	 * @see unipg.dafne.layout.force.Force#computeRepulsiveForce(float[], float)
	 */
	@Override
	public float[] computeRepulsiveForce(float deltaX, float deltaY, float distance, float squareDistance, int v1Deg, int v2Deg) {
		return new float[]{
						deltaX/squareDistance,
						deltaY/squareDistance};
	}

}
