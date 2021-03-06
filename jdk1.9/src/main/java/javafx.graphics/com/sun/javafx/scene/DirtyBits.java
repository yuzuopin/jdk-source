/*
 * Copyright (c) 2007, 2016, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.javafx.scene;


public enum DirtyBits {

    // Dirty bits for the Node class
    NODE_CACHE,
    NODE_CLIP,
    NODE_EFFECT,
    NODE_OPACITY,
    NODE_TRANSFORM,
    NODE_BOUNDS,
    NODE_TRANSFORMED_BOUNDS,
    NODE_VISIBLE,
    NODE_DEPTH_TEST,
    NODE_BLENDMODE,
    NODE_CSS,
    NODE_FORCE_SYNC,
    NODE_VIEW_ORDER,

    // Dirty bits for various subclasses of Node
    NODE_GEOMETRY,  // Used by ImageView, MediaView, and subclasses of Shape and Shape3D
    NODE_CULLFACE, // Used by Shape3D
    NODE_DRAWMODE, // Used by Shape3D
    NODE_SMOOTH,    // Used by ImageView, MediaView, and subclasses of Shape
    NODE_VIEWPORT,  // Used by ImageView and MediaView
    NODE_CONTENTS,  // Used by ImageView, Light, MediaView, Text, WebView, Region, and subclasses of Shape

    // Dirty bits for the Parent class
    PARENT_CHILDREN,  // children removed, added or permuted
    PARENT_CHILDREN_VIEW_ORDER,

    // Dirty bits for the Shape class
    SHAPE_FILL,
    SHAPE_FILLRULE,
    SHAPE_MODE,
    SHAPE_STROKE,
    SHAPE_STROKEATTRS,

    // Dirty bits for the Region class
    REGION_SHAPE,    // Used when shape in region is dirty

    // Dirty bits for the Text class
    TEXT_ATTRS,
    TEXT_FONT,
    TEXT_SELECTION,
    TEXT_HELPER,

    // Dirty bits for the MediaView class
    MEDIAVIEW_MEDIA,

    // Dirty bits for the WebView class
    WEBVIEW_VIEW,

    // Dirty bits for various subclasses of Effect
    EFFECT_EFFECT,    // Used when Effect is dirty

    // Dirty bits for Camera class
    NODE_CAMERA,
    NODE_CAMERA_TRANSFORM,

    // Dirty bits for Light class
    NODE_LIGHT,
    NODE_LIGHT_SCOPE,
    NODE_LIGHT_TRANSFORM,

    // Dirty bits for Material class (non Node type)
    MATERIAL,

    // Dirty bits for Mesh class (non Node type)
    MESH,
    MESH_GEOM,

    // Used for any debug information we want to sync down.
    DEBUG,

    // NOTE: The following MUST be the last enum value in this class. The ordinal
    // of this enum indicates the number of dirty bits in this set, exclusive of
    // the MAX_DIRTY bit itself, which will never be set or tested.
    MAX_DIRTY;

    private long mask;

    private DirtyBits() {
        mask = 1 << ordinal();
    }

    public final long getMask() { return mask; }
}
