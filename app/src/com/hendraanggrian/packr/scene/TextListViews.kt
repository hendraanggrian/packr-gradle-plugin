@file:Suppress("NOTHING_TO_INLINE")

package com.hendraanggrian.packr.scene

import kotfx.annotations.SceneDsl
import kotfx.scene.ChildManager
import java.io.File

inline fun ChildManager.textListView(
    initialFile: File,
    hint: String,
    canBrowseFile: Boolean = false,
    canBrowseDirectory: Boolean = false,
    extension: String? = null,
    noinline init: ((@SceneDsl TextListView).() -> Unit)? = null
): TextListView = TextListView(initialFile, hint, canBrowseFile, canBrowseDirectory, extension).apply { init?.invoke(this) }.add()