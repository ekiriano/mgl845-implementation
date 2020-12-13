/**
 */
package mgl845;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agence Depart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.AgenceDepart#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getAgenceDepart()
 * @model
 * @generated
 */
public interface AgenceDepart extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link mgl845.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see mgl845.Mgl845Package#getAgenceDepart_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Location> getLocation();

} // AgenceDepart
