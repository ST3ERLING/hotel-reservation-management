// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.grpc.stubs;

public interface ReservationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique ID for the reservation
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Unique ID for the reservation
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Name of the customer
   * </pre>
   *
   * <code>string customerName = 2;</code>
   * @return The customerName.
   */
  java.lang.String getCustomerName();
  /**
   * <pre>
   * Name of the customer
   * </pre>
   *
   * <code>string customerName = 2;</code>
   * @return The bytes for customerName.
   */
  com.google.protobuf.ByteString
      getCustomerNameBytes();

  /**
   * <pre>
   * Description of the reservation
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the reservation
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Check-in date in "yyyy-MM-dd" format
   * </pre>
   *
   * <code>string checkIn = 4;</code>
   * @return The checkIn.
   */
  java.lang.String getCheckIn();
  /**
   * <pre>
   * Check-in date in "yyyy-MM-dd" format
   * </pre>
   *
   * <code>string checkIn = 4;</code>
   * @return The bytes for checkIn.
   */
  com.google.protobuf.ByteString
      getCheckInBytes();

  /**
   * <pre>
   * Check-out date in "yyyy-MM-dd" format
   * </pre>
   *
   * <code>string checkOut = 5;</code>
   * @return The checkOut.
   */
  java.lang.String getCheckOut();
  /**
   * <pre>
   * Check-out date in "yyyy-MM-dd" format
   * </pre>
   *
   * <code>string checkOut = 5;</code>
   * @return The bytes for checkOut.
   */
  com.google.protobuf.ByteString
      getCheckOutBytes();
}