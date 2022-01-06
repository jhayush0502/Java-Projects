package com.thinking.machines.nframework.common;
public class Request implements java.io.Serializable
{
private java.lang.String servicePath;
private Object[] arguments;
public void setServicePath(java.lang.String servicePath)
{
this.servicePath=servicePath;
}
public java.lang.String getServicePath()
{
return this.servicePath;
}
public void setArguments(Object ...arguments)
{
this.arguments=arguments;
}
public Object[] getArguments()
{
return this.arguments;
}
}