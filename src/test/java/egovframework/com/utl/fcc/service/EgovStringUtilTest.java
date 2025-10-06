package egovframework.com.utl.fcc.service;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * 2024.10.29 Chung10Kr 명사에 맞는 조사 반환 기능 개발
 */
@Slf4j
public class EgovStringUtilTest {

	@Test
	public void 보조사_은() {
		String expect = EgovStringUtil.getAuxiliaryParticle("이름");
		Assert.assertEquals(expect, "이름은");
	}

	@Test
	public void 보조사_는() {
		String expect = EgovStringUtil.getAuxiliaryParticle("나이");
		Assert.assertEquals(expect, "나이는");
	}

	@Test
	public void 주격_이() {
		String expect = EgovStringUtil.getSubjectParticle("광현");
		Assert.assertEquals(expect, "광현이");
	}

	@Test
	public void 주격_null() {
		String expect = EgovStringUtil.getSubjectParticle("철수");
		Assert.assertEquals(expect, "철수");
	}

	@Test
	public void 목적격_을() {
		String expect = EgovStringUtil.getObjectParticle("생일");
		Assert.assertEquals(expect, "생일을");
	}

	@Test
	public void 목적격_를() {
		String expect = EgovStringUtil.getObjectParticle("나이");
		Assert.assertEquals(expect, "나이를");
	}

	@Test
	public void stripStart() {
		String string = EgovStringUtil.stripStart(null, "*");
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals(null, string);

		string = EgovStringUtil.stripStart("", "*");
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals("", string);

		string = EgovStringUtil.stripStart("abc", "");
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals("abc", string);

		string = EgovStringUtil.stripStart("abc", null);
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals("abc", string);

		string = EgovStringUtil.stripStart("  abc", null);
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals("abc", string);

		string = EgovStringUtil.stripStart("abc  ", null);
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals("abc  ", string);

		string = EgovStringUtil.stripStart(" abc ", null);
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals("abc ", string);

		string = EgovStringUtil.stripStart("yxabc  ", "xyz");
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals("abc  ", string);
	}

	@Test
	public void stripEnd() {
		String string = EgovStringUtil.stripEnd(null, "*");
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals(null, string);

		string = EgovStringUtil.stripEnd("", "*");
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals("", string);

		string = EgovStringUtil.stripEnd("abc", "");
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals("abc", string);

		string = EgovStringUtil.stripEnd("abc", null);
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals("abc", string);

		string = EgovStringUtil.stripEnd("  abc", null);
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals("  abc", string);

		string = EgovStringUtil.stripEnd("abc  ", null);
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals("abc", string);

		string = EgovStringUtil.stripEnd(" abc ", null);
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals(" abc", string);

		string = EgovStringUtil.stripEnd("  abcyx", "xyz");
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
		assertEquals("  abc", string);
	}

	@Test
	public void getRandomStr() {
		String string = EgovStringUtil.getRandomStr('a', 'z');
		if (log.isDebugEnabled()) {
			log.debug("string={}", string);
		}
	}

}