package com.eyousefi.service.impl;

import com.eyousefi.model.DistanceUnit;
import com.eyousefi.model.GeoLocation;
import org.assertj.core.data.Offset;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultLocationServiceTest {
  @Test
  public void distanceBetweenPoints() {
    GeoLocation point1 = GeoLocation.of(59.3303687, 18.051772);
    GeoLocation point2 = GeoLocation.of(59.338486, 17.977609);
    Double distance = new LocationServiceBuilder().build().getDistanceBetween(point1, point2, DistanceUnit.METERS);
    assertThat(distance).isCloseTo(4300, Offset.offset(5d));
  }
}
