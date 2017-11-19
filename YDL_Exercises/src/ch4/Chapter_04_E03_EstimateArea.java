package ch4;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 3:
 *
 * (Geography: estimate areas) Find the GPS locations for
 *
 * - Atlanta, Georgia;
 * - Orlando, Florida;
 * - Savannah, Georgia;
 * - Charlotte, North Carolina;
 *
 *   from www.gps-data-team.com/map/ and compute the estimated area enclosed by these four cities.
 *
 */

public class Chapter_04_E03_EstimateArea {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter points for Atlanta (latitude and longitude) in degrees: ");
		double xAtl = Math.toRadians(33.75);
		double yAtl = Math.toRadians(-84.38);
		
		System.out.println("Enter points for Savannah (latitude and longitude) in degrees: ");
		double xSav = Math.toRadians(32.08);
		double ySav = Math.toRadians(-81.09);
		
		System.out.println("Enter points for Charlotte (latitude and longitude) in degrees: ");
		double xCha = Math.toRadians(35.22);
		double yCha = Math.toRadians(-80.84);
		
		System.out.println("Enter points for Orlando (latitude and longitude) in degrees: ");
		double xOrl = Math.toRadians(28.53);
		double yOrl = Math.toRadians(-81.37);
		
		double radius = 6_371.01;
		
		double distAtlToSav = radius * Math.acos(Math.sin(xAtl) * Math.sin(xSav) + 
						Math.cos(xAtl) * Math.cos(xSav) * Math.cos(yAtl - ySav));
		
		double distAtlToCha = radius * Math.acos(Math.sin(xAtl) * Math.sin(xCha) + 
				Math.cos(xAtl) * Math.cos(xCha) * Math.cos(yAtl - yCha));
		
		double distAtlToOrl = radius * Math.acos(Math.sin(xAtl) * Math.sin(xOrl) + 
				Math.cos(xAtl) * Math.cos(xOrl) * Math.cos(yAtl - yOrl));
		
		double distSavToOrl = radius * Math.acos(Math.sin(xSav) * Math.sin(xOrl) + 
				Math.cos(xSav) * Math.cos(xOrl) * Math.cos(ySav - yOrl));
		
		double distSavToCha = radius * Math.acos(Math.sin(xSav) * Math.sin(xCha) + 
				Math.cos(xSav) * Math.cos(xCha) * Math.cos(ySav - yCha));
		
		double sAtlSavCha = (distAtlToSav + distAtlToCha + distSavToCha) / 2;
		
		double sAtlSavOrl = (distAtlToSav + distAtlToOrl + distSavToCha) / 2;
		
		double areaAtlSavCha = Math.sqrt(sAtlSavCha * (sAtlSavCha - distAtlToSav) * 
										(sAtlSavCha - distAtlToCha) * (sAtlSavCha - distSavToCha));
		
		double areaAtlSavOrl = Math.sqrt(sAtlSavOrl * (sAtlSavCha - distAtlToSav) * 
										(sAtlSavOrl - distAtlToOrl) * (sAtlSavOrl - distSavToCha));
		
		double area = areaAtlSavCha + areaAtlSavOrl;
		
		System.out.println("The area is " + area);

	}

}
