/*
 * Copyright 2020 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.sample.hellocompose

import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.Text
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.wrapContentSize
import androidx.ui.material.ripple.ripple
import com.squareup.sample.hellocompose.HelloWorkflow.Rendering
import com.squareup.workflow.ui.compose.composedViewFactory

val HelloBinding = composedViewFactory<Rendering> { rendering, _ ->
  Clickable(
      onClick = { rendering.onClick() },
      modifier = Modifier.ripple(bounded = true)
          .fillMaxSize()
  ) {
    Text(rendering.message, modifier = Modifier.wrapContentSize(Alignment.Center))
  }
}
