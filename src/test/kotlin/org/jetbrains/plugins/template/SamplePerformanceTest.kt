package org.jetbrains.plugins.template

import com.intellij.testFramework.PlatformTestUtil
import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixture4TestCase
import org.junit.Test

class SamplePerformanceTest : LightPlatformCodeInsightFixture4TestCase() {
    @Test
    fun sample() {
        PlatformTestUtil.newPerformanceTest("my test") {
            Thread.sleep(10)
        }.attempts(5).start()
    }
}