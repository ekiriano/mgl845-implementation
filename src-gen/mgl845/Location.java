/**
 */
package mgl845;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.Location#getDureeLocation <em>Duree Location</em>}</li>
 *   <li>{@link mgl845.Location#getVoiture <em>Voiture</em>}</li>
 *   <li>{@link mgl845.Location#getCommis <em>Commis</em>}</li>
 *   <li>{@link mgl845.Location#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mgl845.Location#isEstApprouvee <em>Est Approuvee</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Duree Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Location</em>' attribute.
	 * @see #setDureeLocation(int)
	 * @see mgl845.Mgl845Package#getLocation_DureeLocation()
	 * @model
	 * @generated
	 */
	int getDureeLocation();

	/**
	 * Sets the value of the '{@link mgl845.Location#getDureeLocation <em>Duree Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Location</em>' attribute.
	 * @see #getDureeLocation()
	 * @generated
	 */
	void setDureeLocation(int value);

	/**
	 * Returns the value of the '<em><b>Voiture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voiture</em>' containment reference.
	 * @see #setVoiture(Voiture)
	 * @see mgl845.Mgl845Package#getLocation_Voiture()
	 * @model containment="true"
	 * @generated
	 */
	Voiture getVoiture();

	/**
	 * Sets the value of the '{@link mgl845.Location#getVoiture <em>Voiture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voiture</em>' containment reference.
	 * @see #getVoiture()
	 * @generated
	 */
	void setVoiture(Voiture value);

	/**
	 * Returns the value of the '<em><b>Commis</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Commis#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commis</em>' reference.
	 * @see #setCommis(Commis)
	 * @see mgl845.Mgl845Package#getLocation_Commis()
	 * @see mgl845.Commis#getLocation
	 * @model opposite="location"
	 * @generated
	 */
	Commis getCommis();

	/**
	 * Sets the value of the '{@link mgl845.Location#getCommis <em>Commis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commis</em>' reference.
	 * @see #getCommis()
	 * @generated
	 */
	void setCommis(Commis value);

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(Date)
	 * @see mgl845.Mgl845Package#getLocation_DateDebut()
	 * @model
	 * @generated
	 */
	Date getDateDebut();

	/**
	 * Sets the value of the '{@link mgl845.Location#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Est Approuvee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Approuvee</em>' attribute.
	 * @see #setEstApprouvee(boolean)
	 * @see mgl845.Mgl845Package#getLocation_EstApprouvee()
	 * @model
	 * @generated
	 */
	boolean isEstApprouvee();

	/**
	 * Sets the value of the '{@link mgl845.Location#isEstApprouvee <em>Est Approuvee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Approuvee</em>' attribute.
	 * @see #isEstApprouvee()
	 * @generated
	 */
	void setEstApprouvee(boolean value);

} // Location
