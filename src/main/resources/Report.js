/*eslint-disable block-scoped-var, id-length, no-control-regex, no-magic-numbers, no-prototype-builtins, no-redeclare, no-shadow, no-var, sort-vars*/
(function($protobuf) {
    "use strict";

    // Common aliases
    var $Reader = $protobuf.Reader, $Writer = $protobuf.Writer, $util = $protobuf.util;
    
    // Exported root namespace
    var $root = $protobuf.roots.reportapi || ($protobuf.roots.reportapi = {});
    
    $root.Report = (function() {
    
        /**
         * Properties of a Report.
         * @exports IReport
         * @interface IReport
         * @property {Array.<number>|null} [violations] Report violations
         * @property {Array.<number>|null} [warnings] Report warnings
         * @property {Array.<number>|null} [info] Report info
         * @property {Array.<string>|null} [dates] Report dates
         */
    
        /**
         * Constructs a new Report.
         * @exports Report
         * @classdesc Represents a Report.
         * @implements IReport
         * @constructor
         * @param {IReport=} [properties] Properties to set
         */
        function Report(properties) {
            this.violations = [];
            this.warnings = [];
            this.info = [];
            this.dates = [];
            if (properties)
                for (var keys = Object.keys(properties), i = 0; i < keys.length; ++i)
                    if (properties[keys[i]] != null)
                        this[keys[i]] = properties[keys[i]];
        }
    
        /**
         * Report violations.
         * @member {Array.<number>} violations
         * @memberof Report
         * @instance
         */
        Report.prototype.violations = $util.emptyArray;
    
        /**
         * Report warnings.
         * @member {Array.<number>} warnings
         * @memberof Report
         * @instance
         */
        Report.prototype.warnings = $util.emptyArray;
    
        /**
         * Report info.
         * @member {Array.<number>} info
         * @memberof Report
         * @instance
         */
        Report.prototype.info = $util.emptyArray;
    
        /**
         * Report dates.
         * @member {Array.<string>} dates
         * @memberof Report
         * @instance
         */
        Report.prototype.dates = $util.emptyArray;
    
        /**
         * Creates a new Report instance using the specified properties.
         * @function create
         * @memberof Report
         * @static
         * @param {IReport=} [properties] Properties to set
         * @returns {Report} Report instance
         */
        Report.create = function create(properties) {
            return new Report(properties);
        };
    
        /**
         * Encodes the specified Report message. Does not implicitly {@link Report.verify|verify} messages.
         * @function encode
         * @memberof Report
         * @static
         * @param {IReport} message Report message or plain object to encode
         * @param {$protobuf.Writer} [writer] Writer to encode to
         * @returns {$protobuf.Writer} Writer
         */
        Report.encode = function encode(message, writer) {
            if (!writer)
                writer = $Writer.create();
            if (message.violations != null && message.violations.length)
                for (var i = 0; i < message.violations.length; ++i)
                    writer.uint32(/* id 1, wireType 0 =*/8).int32(message.violations[i]);
            if (message.warnings != null && message.warnings.length)
                for (var i = 0; i < message.warnings.length; ++i)
                    writer.uint32(/* id 2, wireType 0 =*/16).int32(message.warnings[i]);
            if (message.info != null && message.info.length)
                for (var i = 0; i < message.info.length; ++i)
                    writer.uint32(/* id 3, wireType 0 =*/24).int32(message.info[i]);
            if (message.dates != null && message.dates.length)
                for (var i = 0; i < message.dates.length; ++i)
                    writer.uint32(/* id 4, wireType 2 =*/34).string(message.dates[i]);
            return writer;
        };
    
        /**
         * Encodes the specified Report message, length delimited. Does not implicitly {@link Report.verify|verify} messages.
         * @function encodeDelimited
         * @memberof Report
         * @static
         * @param {IReport} message Report message or plain object to encode
         * @param {$protobuf.Writer} [writer] Writer to encode to
         * @returns {$protobuf.Writer} Writer
         */
        Report.encodeDelimited = function encodeDelimited(message, writer) {
            return this.encode(message, writer).ldelim();
        };
    
        /**
         * Decodes a Report message from the specified reader or buffer.
         * @function decode
         * @memberof Report
         * @static
         * @param {$protobuf.Reader|Uint8Array} reader Reader or buffer to decode from
         * @param {number} [length] Message length if known beforehand
         * @returns {Report} Report
         * @throws {Error} If the payload is not a reader or valid buffer
         * @throws {$protobuf.util.ProtocolError} If required fields are missing
         */
        Report.decode = function decode(reader, length) {
            if (!(reader instanceof $Reader))
                reader = $Reader.create(reader);
            var end = length === undefined ? reader.len : reader.pos + length, message = new $root.Report();
            while (reader.pos < end) {
                var tag = reader.uint32();
                switch (tag >>> 3) {
                case 1:
                    if (!(message.violations && message.violations.length))
                        message.violations = [];
                    if ((tag & 7) === 2) {
                        var end2 = reader.uint32() + reader.pos;
                        while (reader.pos < end2)
                            message.violations.push(reader.int32());
                    } else
                        message.violations.push(reader.int32());
                    break;
                case 2:
                    if (!(message.warnings && message.warnings.length))
                        message.warnings = [];
                    if ((tag & 7) === 2) {
                        var end2 = reader.uint32() + reader.pos;
                        while (reader.pos < end2)
                            message.warnings.push(reader.int32());
                    } else
                        message.warnings.push(reader.int32());
                    break;
                case 3:
                    if (!(message.info && message.info.length))
                        message.info = [];
                    if ((tag & 7) === 2) {
                        var end2 = reader.uint32() + reader.pos;
                        while (reader.pos < end2)
                            message.info.push(reader.int32());
                    } else
                        message.info.push(reader.int32());
                    break;
                case 4:
                    if (!(message.dates && message.dates.length))
                        message.dates = [];
                    message.dates.push(reader.string());
                    break;
                default:
                    reader.skipType(tag & 7);
                    break;
                }
            }
            return message;
        };
    
        /**
         * Decodes a Report message from the specified reader or buffer, length delimited.
         * @function decodeDelimited
         * @memberof Report
         * @static
         * @param {$protobuf.Reader|Uint8Array} reader Reader or buffer to decode from
         * @returns {Report} Report
         * @throws {Error} If the payload is not a reader or valid buffer
         * @throws {$protobuf.util.ProtocolError} If required fields are missing
         */
        Report.decodeDelimited = function decodeDelimited(reader) {
            if (!(reader instanceof $Reader))
                reader = new $Reader(reader);
            return this.decode(reader, reader.uint32());
        };
    
        /**
         * Verifies a Report message.
         * @function verify
         * @memberof Report
         * @static
         * @param {Object.<string,*>} message Plain object to verify
         * @returns {string|null} `null` if valid, otherwise the reason why it is not
         */
        Report.verify = function verify(message) {
            if (typeof message !== "object" || message === null)
                return "object expected";
            if (message.violations != null && message.hasOwnProperty("violations")) {
                if (!Array.isArray(message.violations))
                    return "violations: array expected";
                for (var i = 0; i < message.violations.length; ++i)
                    if (!$util.isInteger(message.violations[i]))
                        return "violations: integer[] expected";
            }
            if (message.warnings != null && message.hasOwnProperty("warnings")) {
                if (!Array.isArray(message.warnings))
                    return "warnings: array expected";
                for (var i = 0; i < message.warnings.length; ++i)
                    if (!$util.isInteger(message.warnings[i]))
                        return "warnings: integer[] expected";
            }
            if (message.info != null && message.hasOwnProperty("info")) {
                if (!Array.isArray(message.info))
                    return "info: array expected";
                for (var i = 0; i < message.info.length; ++i)
                    if (!$util.isInteger(message.info[i]))
                        return "info: integer[] expected";
            }
            if (message.dates != null && message.hasOwnProperty("dates")) {
                if (!Array.isArray(message.dates))
                    return "dates: array expected";
                for (var i = 0; i < message.dates.length; ++i)
                    if (!$util.isString(message.dates[i]))
                        return "dates: string[] expected";
            }
            return null;
        };
    
        /**
         * Creates a Report message from a plain object. Also converts values to their respective internal types.
         * @function fromObject
         * @memberof Report
         * @static
         * @param {Object.<string,*>} object Plain object
         * @returns {Report} Report
         */
        Report.fromObject = function fromObject(object) {
            if (object instanceof $root.Report)
                return object;
            var message = new $root.Report();
            if (object.violations) {
                if (!Array.isArray(object.violations))
                    throw TypeError(".Report.violations: array expected");
                message.violations = [];
                for (var i = 0; i < object.violations.length; ++i)
                    message.violations[i] = object.violations[i] | 0;
            }
            if (object.warnings) {
                if (!Array.isArray(object.warnings))
                    throw TypeError(".Report.warnings: array expected");
                message.warnings = [];
                for (var i = 0; i < object.warnings.length; ++i)
                    message.warnings[i] = object.warnings[i] | 0;
            }
            if (object.info) {
                if (!Array.isArray(object.info))
                    throw TypeError(".Report.info: array expected");
                message.info = [];
                for (var i = 0; i < object.info.length; ++i)
                    message.info[i] = object.info[i] | 0;
            }
            if (object.dates) {
                if (!Array.isArray(object.dates))
                    throw TypeError(".Report.dates: array expected");
                message.dates = [];
                for (var i = 0; i < object.dates.length; ++i)
                    message.dates[i] = String(object.dates[i]);
            }
            return message;
        };
    
        /**
         * Creates a plain object from a Report message. Also converts values to other types if specified.
         * @function toObject
         * @memberof Report
         * @static
         * @param {Report} message Report
         * @param {$protobuf.IConversionOptions} [options] Conversion options
         * @returns {Object.<string,*>} Plain object
         */
        Report.toObject = function toObject(message, options) {
            if (!options)
                options = {};
            var object = {};
            if (options.arrays || options.defaults) {
                object.violations = [];
                object.warnings = [];
                object.info = [];
                object.dates = [];
            }
            if (message.violations && message.violations.length) {
                object.violations = [];
                for (var j = 0; j < message.violations.length; ++j)
                    object.violations[j] = message.violations[j];
            }
            if (message.warnings && message.warnings.length) {
                object.warnings = [];
                for (var j = 0; j < message.warnings.length; ++j)
                    object.warnings[j] = message.warnings[j];
            }
            if (message.info && message.info.length) {
                object.info = [];
                for (var j = 0; j < message.info.length; ++j)
                    object.info[j] = message.info[j];
            }
            if (message.dates && message.dates.length) {
                object.dates = [];
                for (var j = 0; j < message.dates.length; ++j)
                    object.dates[j] = message.dates[j];
            }
            return object;
        };
    
        /**
         * Converts this Report to JSON.
         * @function toJSON
         * @memberof Report
         * @instance
         * @returns {Object.<string,*>} JSON object
         */
        Report.prototype.toJSON = function toJSON() {
            return this.constructor.toObject(this, $protobuf.util.toJSONOptions);
        };
    
        return Report;
    })();

    return $root;
})(protobuf);
