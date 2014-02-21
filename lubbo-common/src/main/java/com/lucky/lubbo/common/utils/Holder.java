/**  
 * Copyright:   Copyright (c) 2014
 * Company:     LuckyStar Lubbo
 * @author:     Larry.Li  
 * @version:    v1.0.0
 * Create Date: 2014年2月21日 下午3:18:21
 */
package com.lucky.lubbo.common.utils;

public class Holder<T> {

	private volatile T value;

	public void set(T value) {
		this.value = value;
	}

	public T get() {
		return value;
	}
}
