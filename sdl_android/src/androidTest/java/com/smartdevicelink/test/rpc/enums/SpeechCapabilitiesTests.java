package com.smartdevicelink.test.rpc.enums;

import android.test.AndroidTestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import com.smartdevicelink.R;
import com.smartdevicelink.proxy.rpc.enums.SpeechCapabilities;

/**
 * This is a unit test class for the SmartDeviceLink library project class : 
 * {@link com.smartdevicelink.rpc.enums.SpeechCapabilities}
 */
public class SpeechCapabilitiesTests extends AndroidTestCase {

	/**
	 * Verifies that the enum values are not null upon valid assignment.
	 */
	public void testValidEnums () {	
		String example = mContext.getString(R.string.text_caps);
		SpeechCapabilities enumText = SpeechCapabilities.valueForString(example);
		example = mContext.getString(R.string.sapi_phonemes_caps);
		SpeechCapabilities enumSapiPhonemes = SpeechCapabilities.valueForString(example);
		example = mContext.getString(R.string.lhplus_phonemes_caps);
		SpeechCapabilities enumLhplusPhonemes = SpeechCapabilities.valueForString(example);
		example = mContext.getString(R.string.pre_recorded_caps);
		SpeechCapabilities enumPreRecorded = SpeechCapabilities.valueForString(example);
		example = mContext.getString(R.string.silence_caps);
		SpeechCapabilities enumSilence = SpeechCapabilities.valueForString(example);
		
		assertNotNull("TEXT returned null", enumText);
		assertNotNull("SAPI_PHONEMES returned null", enumSapiPhonemes);
		assertNotNull("LHPLUS_PHONEMES returned null", enumLhplusPhonemes);
		assertNotNull("PRE_RECORDED returned null", enumPreRecorded);
		assertNotNull("SILENCE returned null", enumSilence);
	}

	/**
	 * Verifies that an invalid assignment is null.
	 */
	public void testInvalidEnum () {
		String example = mContext.getString(R.string.invalid_enum);
		try {
		    SpeechCapabilities temp = SpeechCapabilities.valueForString(example);
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
		    SpeechCapabilities temp = SpeechCapabilities.valueForString(example);
            assertNull("Result of valueForString should be null.", temp);
		}
		catch (NullPointerException exception) {
            fail("Null string throws NullPointerException.");
		}
	}	

	/**
	 * Verifies the possible enum values of SpeechCapabilities.
	 */
	public void testListEnum() {
 		List<SpeechCapabilities> enumValueList = Arrays.asList(SpeechCapabilities.values());

		List<SpeechCapabilities> enumTestList = new ArrayList<SpeechCapabilities>();
		enumTestList.add(SpeechCapabilities.TEXT);
		enumTestList.add(SpeechCapabilities.SAPI_PHONEMES);
		enumTestList.add(SpeechCapabilities.LHPLUS_PHONEMES);
		enumTestList.add(SpeechCapabilities.PRE_RECORDED);
		enumTestList.add(SpeechCapabilities.SILENCE);

		assertTrue("Enum value list does not match enum class list", 
				enumValueList.containsAll(enumTestList) && enumTestList.containsAll(enumValueList));
	}	
}