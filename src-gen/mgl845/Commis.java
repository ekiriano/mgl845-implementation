/**
 */
package mgl845;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.Commis#getLocation <em>Location</em>}</li>
 *   <li>{@link mgl845.Commis#getReservation <em>Reservation</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getCommis()
 * @model
 * @generated
 */
public interface Commis extends Personne {
	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Reservation#getCommis <em>Commis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' reference.
	 * @see #setReservation(Reservation)
	 * @see mgl845.Mgl845Package#getCommis_Reservation()
	 * @see mgl845.Reservation#getCommis
	 * @model opposite="commis"
	 * @generated
	 */
	Reservation getReservation();

	/**
	 * Sets the value of the '{@link mgl845.Commis#getReservation <em>Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation</em>' reference.
	 * @see #getReservation()
	 * @generated
	 */
	void setReservation(Reservation value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Location#getCommis <em>Commis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see mgl845.Mgl845Package#getCommis_Location()
	 * @see mgl845.Location#getCommis
	 * @model opposite="commis"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link mgl845.Commis#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // Commis
