package com.aliothmoon.maameow.manager

object RootServiceUidPolicy {

    // Android 13+（API 33+）开始 system/display/input 相关限制显著增强
    private const val KEEP_ROOT_MIN_API = 33

    fun shouldKeepRoot(apiLevel: Int): Boolean = apiLevel >= KEEP_ROOT_MIN_API
}
