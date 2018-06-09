package rebue.rna.gen;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Test;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;

import rebue.mbgx.MybatisGeneratorWrap;

/**
 * 项目名称：rna-gen
 * 
 * @author daniel
 * @version 1.0
 * @since JDK 1.8 类说明： 自动生成Mybatis
 */
public class RnaGenTest {

	@Test
	public void test()
			throws IOException, SQLException, InterruptedException, XMLParserException, InvalidConfigurationException {
		MybatisGeneratorWrap.gen(true, "conf/mbg-rna.properties");
	}
}
