package com.smartdevicelink.test.rpc.enums;

import android.test.AndroidTestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import com.smartdevicelink.R;
import com.smartdevicelink.proxy.rpc.enums.EmergencyEventType;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

/**
 * This is a unit test class for the SmartDeviceLink library project class : 
 * {@link com.smartdevicelink.rpc.enums.EmergencyEventType}
 */
public class EmergencyEventTypeTests extends AndroidTestCase {

	/**
	 * Verifies that the enum values are not null upon valid assignment.
	 */
	public void testValidEnums () {	
		String example = mContext.getString(R.string.no_event_caps);
		EmergencyEventType enumEventType = EmergencyEventType.valueForString(example);
		example = mContext.getString(R.string.frontal_caps);
		EmergencyEventType enumFrontal = EmergencyEventType.valueForString(example);
		example = mContext.getString(R.string.side_caps);
		EmergencyEventType enumSide = EmergencyEventType.valueForString(example);
		example = mContext.getString(R.string.rear_caps);
		EmergencyEventType enumRear = EmergencyEventType.valueForString(example);
		example = mContext.getString(R.string.rollover_caps);
		EmergencyEventType enumRollover = EmergencyEventType.valueForString(example);
		example = mContext.getString(R.string.not_supported_caps);
		EmergencyEventType enumNotSupported = EmergencyEventType.valueForString(example);
		example = mContext.getString(R.string.fault_caps);
		EmergencyEventType enumFault = EmergencyEventType.valueForString(example);
		
		assertNotNull("NO_EVENT returned null", enumEventType);
		assertNotNull("FRONTAL returned null", enumFrontal);
		assertNotNull("SIDE returned null", enumSide);
		assertNotNull("REAR returned null", enumRear);
		assertNotNull("ROLLOVER returned null", enumRollover);
		assertNotNull("NOT_SUPPORTED returned null", enumNotSupported);
		assertNotNull("FAULT returned null", enumFault);
	}

	/**
	 * Verifies that an invalid assignment is null.
	 */
	public void testInvalidEnum () {
		String example = mContext.getString(R.string.invalid_enum);
		try {
		    EmergencyEventType temp = EmergencyEventType.valueForString(example);
            assertNull("Result of valueForString should be null.", temp);
		}
		catch (IllegalArgumentException exception) {
            fail("Invalid enum throws IllegalArgumentException.");
		}
	}

	/**
	 * Verifies that a null assignment is invalid.
	 */
	public void testNullEnum () {
		String example = null;
		try {
		    EmergencyEventType temp = EmergencyEventType.valueForString(example);
            assertNull("Result of valueForString should be null.", temp);
		}
		catch (NullPointerException exception) {
            fail("Null string throws NullPointerException.");
		}
	}	

	/**
	 * Verifies the possible enum values of EmergencyEvent.
	 */
	public void testListEnum() {
 		List<EmergencyEventType> enumValueList = Arrays.asList(EmergencyEventType.values());

		List<EmergencyEventType> enumTestList = new ArrayList<EmergencyEventType>();
		enumTestList.add(EmergencyEventType.NO_EVENT);
		enumTestList.add(EmergencyEventType.FRONTAL);
		enumTestList.add(EmergencyEventType.SIDE);
		enumTestList.add(EmergencyEventType.REAR);
		enumTestList.add(EmergencyEventType.ROLLOVER);
		enumTestList.add(EmergencyEventType.NOT_SUPPORTED);		
		enumTestList.add(EmergencyEventType.FAULT);

		assertTrue("Enum value list does not match enum class list", 
				enumValueList.containsAll(enumTestList) && enumTestList.containsAll(enumValueList));
	}	
}