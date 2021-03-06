/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.pipeline.processor.exceptions;

/**
 * Meant to be thrown during "process time" (i.e. after pipeline is built during execution)
 * when the outputs of one handler don't match the inputs of the successive handler. This
 * generally happens when the output or input of a given handler is of type Object and
 * but at runtime the actual type is different than what the user defined or expected.
 * 
 * @author cdancy
 */
public class ProcessTimeTypeMismatchException extends RuntimeException {
    
    public ProcessTimeTypeMismatchException() {
        super();
    }
    
    public ProcessTimeTypeMismatchException(final String message) {
        super(message);
    }
    
    public ProcessTimeTypeMismatchException(final String message, final Throwable throwable) {
        super(message, throwable);
    }
    
    public ProcessTimeTypeMismatchException(final Throwable throwable) {
        super(throwable);
    }
}
