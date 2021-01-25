/*
 *   Copyright 2020-2021 Leon Latsch
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

package dev.leonlatsch.photok.ui.components.bindings

import androidx.databinding.ViewDataBinding

/**
 * Interface for all bindable base ui components.
 *
 * @since 1.0.0
 * @author Leon Latsch
 */
interface Bindable<BindingType : ViewDataBinding> {


    /**
     * Binding instance. Contains all Views and Variables in a layout.
     */
    var binding: BindingType

    /**
     * Used to insert bindings.
     * @sample dev.leonlatsch.photok.ui.components.bindings.BindableActivity.bind
     */
    fun bind(binding: BindingType)

}