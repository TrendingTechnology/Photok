/*
 *   Copyright 2020 Leon Latsch
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package dev.leonlatsch.photok.base

import androidx.lifecycle.MutableLiveData

/**
 * Wrapper for [MutableLiveData] with Generic Type of Int.
 *
 * @since 1.0.0
 *
 */
class NumberLiveData : MutableLiveData<Int> {

    constructor() : super(0)

    constructor(initialValue: Int) : super(initialValue)

    /**
     * Increment the value by 1.
     */
    fun increment() {
        increment(1)
    }

    /**
     * Increment the value by [amount]
     */
    fun increment(amount: Int) = postValue(value!!.plus(amount))
}