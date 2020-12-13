/**
 */
package mgl845;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.Retour#getInspection <em>Inspection</em>}</li>
 *   <li>{@link mgl845.Retour#getAgencearivee <em>Agencearivee</em>}</li>
 *   <li>{@link mgl845.Retour#getReservation <em>Reservation</em>}</li>
 *   <li>{@link mgl845.Retour#getDateRetour <em>Date Retour</em>}</li>
 *   <li>{@link mgl845.Retour#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getRetour()
 * @model
 * @generated
 */
public interface Retour extends EObject {
	/**
	 * Returns the value of the '<em><b>Inspection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inspection</em>' containment reference.
	 * @see #setInspection(Inspection)
	 * @see mgl845.Mgl845Package#getRetour_Inspection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Inspection getInspection();

	/**
	 * Sets the value of the '{@link mgl845.Retour#getInspection <em>Inspection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inspection</em>' containment reference.
	 * @see #getInspection()
	 * @generated
	 */
	void setInspection(Inspection value);

	/**
	 * Returns the value of the '<em><b>Agencearivee</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.AgenceArivee#getRetour <em>Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agencearivee</em>' reference.
	 * @see #setAgencearivee(AgenceArivee)
	 * @see mgl845.Mgl845Package#getRetour_Agencearivee()
	 * @see mgl845.AgenceArivee#getRetour
	 * @model opposite="retour"
	 * @generated
	 */
	AgenceArivee getAgencearivee();

	/**
	 * Sets the value of the '{@link mgl845.Retour#getAgencearivee <em>Agencearivee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agencearivee</em>' reference.
	 * @see #getAgencearivee()
	 * @generated
	 */
	void setAgencearivee(AgenceArivee value);

	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Reservation#getRetour <em>Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' reference.
	 * @see #setReservation(Reservation)
	 * @see mgl845.Mgl845Package#getRetour_Reservation()
	 * @see mgl845.Reservation#getRetour
	 * @model opposite="retour"
	 * @generated
	 */
	Reservation getReservation();

	/**
	 * Sets the value of the '{@link mgl845.Retour#getReservation <em>Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation</em>' reference.
	 * @see #getReservation()
	 * @generated
	 */
	void setReservation(Reservation value);

	/**
	 * Returns the value of the '<em><b>Date Retour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Retour</em>' attribute.
	 * @see #setDateRetour(Date)
	 * @see mgl845.Mgl845Package#getRetour_DateRetour()
	 * @model
	 * @generated
	 */
	Date getDateRetour();

	/**
	 * Sets the value of the '{@link mgl845.Retour#getDateRetour <em>Date Retour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Retour</em>' attribute.
	 * @see #getDateRetour()
	 * @generated
	 */
	void setDateRetour(Date value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see mgl845.Mgl845Package#getRetour_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link mgl845.Retour#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Retour
