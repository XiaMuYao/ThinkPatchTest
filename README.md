# ThinkPatchTest
Think热更新Demo


上手很简单 首先打一个  正常  但是有bug得包  这个包我们叫做 基准包


然后 把bug修复 通过  gradle -> thinker-supoot -> buildTinkerPatchRelease 打包

此时要注意！ 要修改一下tinker-support.gradle 这个文件里面得baseApkDir这个字段 修改成你基准包得路径地址 

然后还有一个thinkerId 这个id在你打基准包得时候是一个 补丁包得时候是一个 自己手动指定修改 

hmmmm 其他自己查查 有时间完善文档
