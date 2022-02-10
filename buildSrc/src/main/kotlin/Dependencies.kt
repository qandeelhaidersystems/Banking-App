
/**
 * Project dependencies, makes it easy to include external binaries or
 * other library modules to build.
 */

object Dependencies {

    const val TIMBER = "com.jakewharton.timber:timber:${BuildDependenciesVersions.timber}"

    const val KOTLIN_VERSION = "org.jetbrains.kotlin:kotlin-stdlib:${BuildDependenciesVersions.kotlinVersion}"
    const val KTX = "androidx.core:core-ktx:${BuildDependenciesVersions.ktx}"
    const val APP_COMBAT = "androidx.appcompat:appcompat:${BuildDependenciesVersions.appCombat}"
    const val MATERIALIZE_DESIGN = "com.google.android.material:material:${BuildDependenciesVersions.materializeDesign}"
    const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${BuildDependenciesVersions.recyclerView}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${BuildDependenciesVersions.constraintLayout}"

    const val JUNIT = "junit:junit:${BuildDependenciesVersions.junit}"
    const val JUNIT_TEST = "androidx.test.ext:junit:${BuildDependenciesVersions.junitTest}"

    const val ESPRESSO = "androidx.test.espresso:espresso-core:${BuildDependenciesVersions.espresso}"

    const val HILT_VIEW_MODEL = "androidx.hilt:hilt-lifecycle-viewmodel:${BuildDependenciesVersions.hiltViewModel}"
    const val HILT_WORK = "androidx.hilt:hilt-work:${BuildDependenciesVersions.hiltWork}"
    const val HILT_DAGGER = "com.google.dagger:hilt-android:${BuildDependenciesVersions.hiltDagger}"
    const val HILT_DAGGER_COMPILER = "com.google.dagger:hilt-android-compiler:${BuildDependenciesVersions.hiltDagger}"
    const val HILT_FRAGMENT = "androidx.fragment:fragment-ktx:${BuildDependenciesVersions.hiltDagger}"

    const val GLIDE = "com.github.bumptech.glide:glide:${BuildDependenciesVersions.glideVersion}"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${BuildDependenciesVersions.glideVersion}"

    const val LIFECYCLE = "androidx.lifecycle:lifecycle-extensions:${BuildDependenciesVersions.lifecycle}"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${BuildDependenciesVersions.retrofit}"
    const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-gson:${BuildDependenciesVersions.retrofit}"
    const val RX_RETROFIT = "com.squareup.retrofit2:adapter-rxjava3:${BuildDependenciesVersions.retrofit}"

    const val MULTIDEX = "com.android.support:multidex:${BuildDependenciesVersions.multiDex}"

    const val ROOM_RUNTIME = "androidx.room:room-runtime:${BuildDependenciesVersions.roomVersion}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${BuildDependenciesVersions.roomVersion}"
    const val ROOM_RX_JAVA_3 = "androidx.room:room-rxjava3:${BuildDependenciesVersions.roomVersion}"
    const val ROOM_KTX = "androidx.room:room-ktx:${BuildDependenciesVersions.roomVersion}"

    const val NAVIGATION_FRAGMENT =  "androidx.navigation:navigation-fragment-ktx:${BuildDependenciesVersions.navVersion}"
    const val NAVIGATION_UI =  "androidx.navigation:navigation-ui-ktx:${BuildDependenciesVersions.navVersion}"

    // Coroutines
    const val COROUTINE_ANDROID =  "org.jetbrains.kotlinx:kotlinx-coroutines-android:${BuildDependenciesVersions.coroutine}"
    const val COROUTINE_CORE =   "org.jetbrains.kotlinx:kotlinx-coroutines-core:${BuildDependenciesVersions.coroutine}"

    const val SWIPE_REFRESH_LAYOUT =   "androidx.swiperefreshlayout:swiperefreshlayout:${BuildDependenciesVersions.swipeRefresh}"



    // jetpack compose
    const val COMPOSE_UI =   "androidx.compose.ui:ui:${BuildDependenciesVersions.composeUi}"
    const val COMPOSE_UI_TOOLING =   "androidx.compose.ui:ui-tooling:${BuildDependenciesVersions.composeUi}"
    const val COMPOSE_FOUNDATION =   "androidx.compose.foundation:foundation:${BuildDependenciesVersions.composeUi}"
    const val COMPOSE_MATERIAL =   "androidx.compose.material:material:${BuildDependenciesVersions.composeUi}"
    const val COMPOSE_MATERIAL_ICONS =   "androidx.compose.material:material-icons-core:${BuildDependenciesVersions.composeUi}"
    const val COMPOSE_MATERIAL_ICONS_EXTENDED =   "androidx.compose.material:material-icons-extended:${BuildDependenciesVersions.composeUi}"
    const val COMPOSE_LIVE_DATA =   "androidx.compose.runtime:runtime-livedata:${BuildDependenciesVersions.composeUi}"
    const val COMPOSE_RX_JAVA_2 =   "androidx.compose.runtime:runtime-rxjava2:${BuildDependenciesVersions.composeUi}"
    const val COMPOSE_JUNIT =   "androidx.compose.ui:ui-test-junit4:${BuildDependenciesVersions.composeUi}"
    const val COMPOSE_ACTIVITY =   "androidx.activity:activity-compose:${BuildDependenciesVersions.composeActivity}"
    const val COMPOSE_CONSTRAINT_LAYOUT =   "androidx.constraintlayout:constraintlayout-compose:${BuildDependenciesVersions.composeConstraintLayout}"

}