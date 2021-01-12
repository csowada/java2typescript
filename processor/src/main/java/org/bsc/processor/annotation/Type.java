package org.bsc.processor.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  
 * @author bsorrentino
 *
 */
@Retention(RetentionPolicy.SOURCE)
@Target( {ElementType.ANNOTATION_TYPE} )
public @interface Type {
	Class<?> value();
	boolean export()		default false ;
	String alias()			default "";
	boolean functional()	default false;

	boolean nodts()			default false;
	boolean includeSuper()  default false;
}
