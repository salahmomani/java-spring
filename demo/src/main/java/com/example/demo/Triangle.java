package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.beans.beancontext.BeanContext;
import java.util.List;

public class Triangle implements ApplicationContextAware , BeanNameAware {
    Point pointA;
    Point pointB;
    Point pointC;
    private  ApplicationContext context=null;
private List<Point> pointList;

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }

    public List<Point> getPointList() {
        return pointList;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {

        System.out.println("PointA("+getPointA().getX()+", "+getPointA().getY()+")");
        System.out.println("PointB("+getPointB().getX()+", "+getPointB().getY()+")");
        System.out.println("PointC("+getPointC().getX()+", "+getPointC().getY()+")");
////        for (Point point : pointList) {
////            System.out.println("Point=("+point.getX()+", "+point.getY()+")");
//        }

    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
    this.context=  context;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("bean name: "+name);

    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("InitializingBean called:");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("DisposableBean destroy called:");
//
//    }
    public void myInit(){
        System.out.println("InitializingBean called:");

    }

    public void destroy(){
        System.out.println("destroy called:");

    }
}