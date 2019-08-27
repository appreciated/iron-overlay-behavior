import {PolymerElement, html} from '@polymer/polymer';
import {mixinBehaviors} from '@polymer/polymer/lib/legacy/class.js';
import {IronOverlayBehavior} from '@polymer/iron-overlay-behavior/iron-overlay-behavior.js';

class IronOverlayWrapper extends mixinBehaviors(IronOverlayBehavior, PolymerElement) {

    static get template() {
        return html`
      <style>
        :host {
           margin-top: unset !important;
        }
      </style> 
      <slot></slot>
    `;
    }
}
customElements.define('iron-overlay-wrapper', IronOverlayWrapper);
