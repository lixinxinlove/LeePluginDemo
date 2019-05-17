package com.lixinxinlove.android.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

public class LeePlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        print("自定义插接")
    }
}