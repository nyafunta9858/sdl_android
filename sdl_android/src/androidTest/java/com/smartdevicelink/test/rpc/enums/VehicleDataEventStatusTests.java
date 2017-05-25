package com.smartdevicelink.test.rpc.enums;

import android.test.AndroidTestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import com.smartdevicelink.R;
import com.smartdevicelink.proxy.rpc.enums.VehicleDataEventStatus;

/**
 * This is a unit test class for the SmartDeviceLink library project class : 
 * {@link com.smartdevicelink.rpc.enums.VehicleDataEventStatus}
 */
public class VehicleDataEventStatusTests extends AndroidTestCase {

	/**
	 * Verifies that the enum values are not null upon valid assignment.
	 */
	public void testValidEnums () {	
		String example = mContext.getString(R.string.no_event_caps);
		VehicleDataEventStatus enumNoEvent = VehicleDataEventStatus.valueForString(example);
		example = mContext.getString(R.string.no_caps);
		VehicleDataEventStatus enumNo = VehicleDataEventStatus.valueForString(example);
		example = mContext.getString(R.string.yes_caps);
		VehicleDataEventStatus enumYes = VehicleDataEventStatus.valueForString(example);
		example = mContext.getString(R.string.not_supported_caps);
		VehicleDataEventStatus enumNotSupported = VehicleDataEventStatus.valueForString(example);
		example = mContext.getString(R.string.fault_caps);
		VehicleDataEventStatus enumFault = VehicleDataEventStatus.valueForString(example);
		
		assertNotNull("NO_EVENT returned null", enumNoEvent);
		assertNotNull("NO returned null", enumNo);
		assertNotNull("YES returned null", enumYes);
		assertNotNull("NOT_SUPPORTED returned null", enumNotSupported);
		assertNotNull("FAULT returned null", enumFault);
	}
	
	/**
	 * Verifies that an invalid assignment is null.
	 */
	public void testInvalidEnum () {
		String example = mContext.getString(R.string.invalid_enum);
		try {
		    VehicleDataEventStatus temp = VehicleDataEventStatus.valueForString(example);
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
		    VehicleDataEventStatus temp = VehicleDataEventStatus.valueForString(example);
            assertNull("Result of valueForString should be null.", temp);
		}
		catch (NullPointerException exception) {
            fail("Null string throws NullPointerException.");
		}
	}	
	
	/**
	 * Verifies the possible enum values of AmbientLightStatus.
	 */
	public void testListEnum() {
 		List<VehicleDataEventStatus> enumValueList = Arrays.asList(VehicleDataEventStatus.values());

		List<VehicleDataEventStatus> enumTestList = new ArrayList<VehicleDataEventStatus>();
		enumTestList.add(VehicleDataEventStatus.NO_EVENT);
		enumTestList.add(VehicleDataEventStatus.NO);
		enumTestList.add(VehicleDataEventStatus.YES);
		enumTestList.add(VehicleDataEventStatus.NOT_SUPPORTED);
		enumTestList.add(VehicleDataEventStatus.FAULT);

		assertTrue("Enum value list does not match enum class list", 
				enumValueList.containsAll(enumTestList) && enumTestList.containsAll(enumValueList));
	}	
}