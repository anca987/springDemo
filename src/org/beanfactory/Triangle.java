package org.beanfactory;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import org.beanfactory.Point;

public class Triangle implements ApplicationContextAware, BeanNameAware {

	private List<Point> points;
	private ApplicationContext context = null;

//	public void draw() {
//		System.out.println("Point A = (" + getPointA().getX() + ", "
//				+ getPointA().getY() + ")");
//		System.out.println("Point A = (" + getPointB().getX() + ", "
//				+ getPointB().getY() + ")");
//		System.out.println("Point A = (" + getPointC().getX() + ", "
//				+ getPointC().getY() + ")");
//	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is: " + beanName);
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
}
