/**  
 * Copyright:   Copyright (c) 2014
 * Company:     LuckyStar Lubbo
 * @author:     Larry.Li  
 * @version:    v1.0.0
 * Create Date: 2014年2月21日 下午3:23:31
 */
package com.lucky.lubbo.common.compiler;

import com.lucky.lubbo.common.extension.SPI;

/**
 * Compiler. (SPI, Singleton, ThreadSafe)
 */
@SPI("javassist")
public interface Compiler {

	/**
	 * Compile java source code.
	 * 
	 * @param code Java source code
	 * @param classLoader TODO
	 * @return Compiled class
	 */
	Class<?> compile(String code, ClassLoader classLoader);

}
