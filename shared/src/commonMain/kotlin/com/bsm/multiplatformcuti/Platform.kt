package com.bsm.multiplatformcuti

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform