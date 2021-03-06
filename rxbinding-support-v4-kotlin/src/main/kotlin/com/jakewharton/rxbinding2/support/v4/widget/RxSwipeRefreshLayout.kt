@file:Suppress("NOTHING_TO_INLINE")

package com.jakewharton.rxbinding2.support.v4.widget

import android.support.annotation.CheckResult
import android.support.v4.widget.SwipeRefreshLayout
import com.jakewharton.rxbinding2.internal.VoidToUnit
import io.reactivex.Observable
import io.reactivex.functions.Consumer
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit

/**
 * Create an observable of refresh events on `view`.
 *
 * *Warning:* The created observable keeps a strong reference to `view`. Unsubscribe
 * to free this reference.
 */
@CheckResult
inline fun SwipeRefreshLayout.refreshes(): Observable<Unit> = RxSwipeRefreshLayout.refreshes(this).map(VoidToUnit)

/**
 * An action which sets whether the layout is showing the refreshing indicator.
 *
 * *Warning:* The created observable keeps a strong reference to `view`. Unsubscribe
 * to free this reference.
 */
@Deprecated("Use view::setRefreshing method reference.")
@CheckResult
inline fun SwipeRefreshLayout.refreshing(): Consumer<in Boolean> = RxSwipeRefreshLayout.refreshing(this)
