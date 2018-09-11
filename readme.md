﻿# Spring Security鉴权

## 简介
该项目使用spring boot2.0开发，所有配置均为最简配置；有复杂配置需求可自行定制。
该项目要求jdk版本为1.8。

如有问题欢迎联系！

作者：唐乾红
邮箱：qianhongtang@gmail.com

该项目实现的内容为：
1.	鉴权服务器
2.	资源服务器
3.	注解缓存相关数据

项目使用技术和方案:
1. 使用Spring Security作为鉴权的基础。
2. 使用Redis作为共享session和token的存储。
3. 使用mysql数据库存储用户和客户端配。
4. 使用JPA操作数据。
5. 通过yml配置多环境。

## 模块列表
1. 用户认证、鉴权

## 使用说明
见Wiki

## 想提意见？
请直接在本项目里面新建Issue

## 想贡献代码？
热烈欢迎。请直接Fork这个仓库，然后提交merge request.