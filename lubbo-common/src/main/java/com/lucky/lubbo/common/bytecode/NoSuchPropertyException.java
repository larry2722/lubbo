/**  
 * Copyright:   Copyright (c) 2014
 * Company:     LuckyStar Lubbo
 * @author:     Larry.Li  
 * @version:    v1.0.0
 * Create Date: 2014年2月21日 下午4:42:53
 */
package com.lucky.lubbo.common.bytecode;

public class NoSuchPropertyException extends RuntimeException
{
	private static final long serialVersionUID = -2725364246023268766L;

	public NoSuchPropertyException()
	{
		super();
	}

	public NoSuchPropertyException(String msg)
	{
		super(msg);
	}
}
