

interface BuildTypes {
    companion object {
        const val DEBUG = "debug"
        const val RELEASE = "release"
    }
}

object BuildTypeDebug {
    const val isMinifyEnabled = false
    const val isShrinkResourceEnabled = false
    const val isDebuggableEnabled = true
//    const val getMerchantProfileId = BuildConfigFields.PRODUCTION_MERCHANT_PROFILE_ID
//    const val getMerchantServerKey = BuildConfigFields.PRODUCTION_MERCHANT_SERVER_KEY
//    const val getMerchantClientKey = BuildConfigFields.PRODUCTION_MERCHANT_CLIENT_KEY
//    const val getBaseUrl = BuildConfigFields.PRODUCTION_BASE_URL
}

object BuildTypeRelease {
    const val isMinifyEnabled = false
    const val isShrinkResourceEnabled = false
    const val isDebuggableEnabled = false
//    const val getMerchantProfileId = BuildConfigFields.STAGING_MERCHANT_PROFILE_ID
//    const val getMerchantServerKey = BuildConfigFields.STAGING_MERCHANT_SERVER_KEY
//    const val getMerchantClientKey = BuildConfigFields.STAGING_MERCHANT_CLIENT_KEY
//    const val getBaseUrl = BuildConfigFields.STAGING_BASE_URL
}