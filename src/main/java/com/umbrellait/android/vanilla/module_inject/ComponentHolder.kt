package com.umbrellait.android.vanilla.module_inject

interface BaseFeatureDependencies {
    val dependencyHolder: BaseDependencyHolder<out BaseFeatureDependencies>
}

interface BaseFeatureAPI

interface ComponentHolder<A : BaseFeatureAPI, D : BaseFeatureDependencies> {

    var dependencyProvider: (() -> D)?

    fun api(): A
}

