/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2017 the original author or authors.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 */

package tk.mybatis.mapper.weekend;

import tk.mybatis.mapper.weekend.reflection.Reflections;

/**
 * @author Frank
 */
public class Weekend<T> extends tk.mybatis.mapper.entity.Example {

    public Weekend(Class<T> entityClass) {
        super(entityClass);
    }

    public Weekend(Class<T> entityClass, boolean exists) {
        super(entityClass, exists);
    }

    public Weekend(Class<T> entityClass, boolean exists, boolean notNull) {
        super(entityClass, exists, notNull);
    }

    public static <A> Weekend<A> of(Class<A> clazz, Boolean exists, boolean notNull) {
        return new Weekend<A>(clazz, exists, notNull);
    }

    public static <A> Weekend<A> of(Class<A> clazz, Boolean exists) {
        return new Weekend<A>(clazz, exists, Boolean.FALSE);
    }

    public static <A> Weekend<A> of(Class<A> clazz) {
        return new Weekend<A>(clazz, Boolean.TRUE);
    }

    public WeekendCriteria<T, Object> createCriteriaAddOn() {
        WeekendCriteria<T, Object> weekendCriteria = new WeekendCriteria<>(this.propertyMap, this.exists, this.notNull);
        return weekendCriteria;
    }

    @Override
    protected Criteria createCriteriaInternal() {
        return this.createCriteriaAddOn();
    }

    @SuppressWarnings("all")
    public WeekendCriteria<T, Object> weekendCriteria() {
        return (WeekendCriteria<T, Object>) this.createCriteria();
    }


    public OrderBy orderBy(Fn<T, Object> fn) {
        return super.orderBy(Reflections.fnToFieldName(fn));
    }
}
